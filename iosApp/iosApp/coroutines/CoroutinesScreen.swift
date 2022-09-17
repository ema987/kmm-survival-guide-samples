//
//  CoroutinesScreen.swift
//  iosApp
//
//  Created by Emanuele on 17/09/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared

struct CoroutinesScreen: View {
    
    @ObservedObject var viewModel: CoroutinesScreenViewModel
    
    var body: some View {
        VStack {
            Button {
                viewModel.onShowMyNameClicked()
            } label: {
                Text("Show my name!")
            }
            Text(viewModel.state.formattedName ?? "My name is...")
            Button {
                viewModel.onShowMyNameWithCombineClicked()
            } label: {
                Text("Show my name with async!")
            }
            Text(viewModel.state.formattedNameWithAsync ?? "My name is...")
        }
    }
}
