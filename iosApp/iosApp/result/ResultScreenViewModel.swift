//
//  ResultScreenViewModel.swift
//  iosApp
//
//  Created by Emanuele on 17/09/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import shared

class ResultScreenViewModel: ObservableObject {
    
    @Published var state: ResultScreenState = ResultScreenState()
    
    func onShowRandomDoubleClicked() {
        let randomDouble = RandomDoubleGeneratorKt.getRandomDouble()
        //randomDouble has type Any?
        state.formattedRandomDouble = String(describing: randomDouble)
    }
        
}
