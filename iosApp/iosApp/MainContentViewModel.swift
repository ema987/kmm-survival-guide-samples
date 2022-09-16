//
//  MainContentViewModel.swift
//  iosApp
//
//  Created by Emanuele on 15/09/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import shared
import sharedSwift

class MainContentViewModel: ObservableObject {
    
    @Published var state: MainContentViewState = MainContentViewState()
    
    init() {
        self.state = MainContentViewState(randomInt: nil)
    }
    
    func onGetRandomIntClicked() {
        let randomInt = RandomNumberGeneratorKt.getRandomInt()
        state.randomInt = randomInt
    }
    
    func onGetRandomIntWrappedInIntResultClicked() {
        let randomIntWrappedInIntResult = RandomNumberGeneratorKt.getRandomIntWrappedInIntResult()
        state.randomIntWrappedInIntResult = randomIntWrappedInIntResult
    }
    
    func onGetRandomIntWrappedInResultClicked() {
        let randomIntWrappedInResult = RandomNumberGeneratorKt.getRandomIntWrappedInResult()
        state.randomIntWrappedInResult = randomIntWrappedInResult
    }
    
    func onGetRandomIntWrappedInResultKSClicked() {
        let randomIntWrappedInResult = RandomNumberGeneratorKt.getRandomIntWrappedInResult()
        state.randomIntWrappedInResultKS = KMMResultKs(randomIntWrappedInResult)
    }
    
}
