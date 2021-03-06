(function () {
	'use strict';

	/**
	 * @ngdoc function
	 * @name app.test:opportunityTest
	 * @description
	 * # opportunityTest
	 * Test of the app
	 */

	describe('opportunity test', function () {
		var controller = null, $scope = null;

		beforeEach(function () {
			module('vha');
		});

		beforeEach(inject(function ($controller, $rootScope) {
			$scope = $rootScope.$new();
			controller = $controller('OpportunityCtrl', {
				$scope: $scope
			});
		}));

		it('Should controller must be defined', function () {
			expect(controller).toBeDefined();
		});

	});
})();
