//
//  ThirdPartyScreenViewModel.swift
//  iosApp
//
//  Created by Emanuele on 18/09/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import shared

class ThirdPartyScreenViewModel: ObservableObject {
    
    @Published var state: ThirdPartyScreenState = ThirdPartyScreenState()
    
    private let systemInformationRetriever = SystemInformationRetrieverImpl(systemInformationRetriever: SystemInformationRetrieverIOS())
    
    func onShowSystemNameClicked() {
        state.systemName = systemInformationRetriever.getSystemName()
    }
        
}
