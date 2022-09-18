//
//  ThirdPartyScreen.swift
//  iosApp
//
//  Created by Emanuele on 18/09/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared

struct ThirdPartyScreen: View {
    
    @ObservedObject var viewModel: ThirdPartyScreenViewModel
    
    var body: some View {
        VStack {
            Button {
                viewModel.onShowSystemNameClicked()
            } label: {
                Text("Show system name")
            }
            Text(viewModel.state.systemName ?? "Not retrieved yet")
        }
    }
}
