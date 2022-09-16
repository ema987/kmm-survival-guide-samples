//
//  SealedClassesAndGenericsScreen.swift
//  iosApp
//
//  Created by Emanuele on 16/09/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared

struct SealedClassesAndGenericsScreenView: View {
    
    @ObservedObject var viewModel: SealedClassesAndGenericsScreenViewModel
    
    var body: some View {
        VStack {
            HStack {
                Button(action: {
                    viewModel.onGetRandomIntClicked()
                }) {
                    Text("getRandomInt")
                }
                let randomIntText = viewModel.state.randomInt?.description ?? "Tap the button"
                Text(randomIntText)
            }
            HStack {
                Button(action: {
                    viewModel.onGetRandomIntWrappedInIntResultClicked()
                }) {
                    Text("getRandomIntInIntResult")
                }
                let randomIntWrappedInIntResult = viewModel.state.randomIntWrappedInIntResult
                switch randomIntWrappedInIntResult {
                case .none:
                    Text("Tap the button")
                case .some(let wrapped):
                    switch wrapped {
                    case let error as KMMIntResult.ErrorKMMIntResult:
                        Text("Error: \(error.throwable.message ?? error.throwable.description())")
                    case let success as KMMIntResult.SuccessKMMIntResult:
                        Text("Success: \(success.value)")
                    default:
                        Text("This never happens")
                    }
                }
            }
            HStack {
                Button(action: {
                    viewModel.onGetRandomIntWrappedInResultClicked()
                }) {
                    Text("getRandomIntInResult")
                }
                let randomIntWrappedInResult = viewModel.state.randomIntWrappedInResult
                switch randomIntWrappedInResult {
                case .none:
                    Text("Tap the button")
                case .some(let wrapped):
                    switch wrapped {
                    case let error as KMMResultErrorKMMResult<KotlinInt>:
                        Text("Error: \(error.throwable.message ?? error.throwable.description())")
                    case let success as KMMResultSuccessKMMResult<KotlinInt>:
                        Text("Success: \(success.value?.description ?? "ERROR")")
                    default:
                        Text("This never happens")
                    }
                }
            }
            HStack {
                Button(action: {
                    viewModel.onGetRandomIntWrappedInResultKSClicked()
                }) {
                    Text("getRandomIntInResultKS")
                }
                let randomIntWrappedInResultKS = viewModel.state.randomIntWrappedInResultKS
                switch randomIntWrappedInResultKS {
                case .none:
                    Text("Tap the button")
                case .some(let wrapped):
                    switch wrapped {
                    case let .errorKMMResult(error):
                        Text("Error: \(error.throwable.message ?? error.throwable.description())")
                    case let .successKMMResult(success):
                        Text("Success: \(success.value?.description ?? "ERROR")")
                    }
                }
            }
        }
    }
}
