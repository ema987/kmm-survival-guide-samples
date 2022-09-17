//
//  ResultScreen.swift
//  iosApp
//
//  Created by Emanuele on 17/09/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared

struct ResultScreen: View {
    
    @ObservedObject var viewModel: ResultScreenViewModel
    
    var body: some View {
        VStack {
            Button {
                viewModel.onShowRandomDoubleClicked()
            } label: {
                Text("Show random double")
            }
            Text(viewModel.state.formattedRandomDouble ?? "Not generated yet")
        }
    }
}
