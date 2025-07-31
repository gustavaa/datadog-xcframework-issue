ios-project:
	$(MAKE) check-xcodegen
	rm -rf iosApp/iosApp.xcodeproj
	xcodegen generate --spec iosApp/project-local.yml
	open iosApp/iosApp.xcodeproj

check-xcodegen:
	@which xcodegen > /dev/null || $(MAKE) install-xcodegen

install-xcodegen:
	@echo "XcodeGen is not installed. Installing..."
	@brew install xcodegen
	@echo "XcodeGen installed successfully!"