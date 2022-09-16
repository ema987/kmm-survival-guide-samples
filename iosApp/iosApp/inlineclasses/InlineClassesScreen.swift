//
//  InlineClassesScreen.swift
//  iosApp
//
//  Created by Emanuele on 16/09/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared

struct InlineClassesScreenView: View {
    
    @ObservedObject var viewModel: InlineClassesScreenViewModel
    
    var body: some View {
        VStack {
            Button {
                viewModel.onShowMyNameClicked()
            } label: {
                Text("Show my name!")
            }
            Text(viewModel.state.formattedName ?? "My name is...")
            Button {
                viewModel.onShowMyNameUsingInlineClassesClicked()
            } label: {
                Text("Show my name using Inline Classes!")
            }
            Text(viewModel.state.formattedNameUsingInlineClasses ?? "My InlineClasses name is")
        }
    }
}
