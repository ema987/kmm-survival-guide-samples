//
//  SealedClassesAndGenericsScreenViewModel.swift
//  iosApp
//
//  Created by Emanuele on 16/09/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import shared
import sharedSwift

class SealedClassesAndGenericsScreenViewModel: ObservableObject {
    
    @Published var state: SealedClassesAndGenericsScreenState = SealedClassesAndGenericsScreenState()
    
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
