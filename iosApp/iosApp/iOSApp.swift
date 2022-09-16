import SwiftUI

@main
struct iOSApp: App {
    
    @ObservedObject private var mainContentViewModel: MainContentViewModel
    
    init() {
        self.mainContentViewModel = MainContentViewModel()
    }
    
	var body: some Scene {
		WindowGroup {
			MainContentView(viewModel: mainContentViewModel)
		}
	}
}
