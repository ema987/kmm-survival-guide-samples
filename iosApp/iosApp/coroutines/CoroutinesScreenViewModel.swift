//
//  CoroutinesScreenViewModel.swift
//  iosApp
//
//  Created by Emanuele on 17/09/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import shared
import KMPNativeCoroutinesCombine

class CoroutinesScreenViewModel: ObservableObject {
    
    @Published var state: CoroutinesScreenState = CoroutinesScreenState()
    private let coroutinesProfileFormatter = CoroutinesProfileFormatter()
    
    func onShowMyNameClicked() {
        coroutinesProfileFormatter.formatFirstAndLastNameWithCoroutines(firstName: "John", lastName: "Doe") { formattedName, error in
            DispatchQueue.main.async {
                self.state.formattedName = formattedName!
            }
        }
    }
    
    func onShowMyNameWithCombineClicked() {
        let formatFirstAndLastNamePublisher = createPublisher(for: coroutinesProfileFormatter.formatFirstAndLastNameWithCoroutinesNative(firstName: "Async", lastName: "Doe"))
        formatFirstAndLastNamePublisher
            .subscribe(on: DispatchQueue.main)
            .receive(on: DispatchQueue.main)
            .sink { completion in
            print("Received completion: \(completion)")
        } receiveValue: { value in
            self.state.formattedNameWithAsync = value
        }
    }
    
}
