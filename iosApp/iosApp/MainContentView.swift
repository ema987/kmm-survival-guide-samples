import SwiftUI
import shared

struct MainContentView: View {
        
    var body: some View {
        NavigationView {
            VStack {
                NavigationLink(destination: SealedClassesAndGenericsScreenView(viewModel: SealedClassesAndGenericsScreenViewModel())) {
                    Text("Sealed classes and generics")
                }
                NavigationLink(destination: InlineClassesScreenView(viewModel: InlineClassesScreenViewModel())) {
                    Text("Inline classes")
                }
                NavigationLink(destination: CoroutinesScreen(viewModel: CoroutinesScreenViewModel())) {
                    Text("Coroutines")
                }
            }
        }
    }
    
    
}
