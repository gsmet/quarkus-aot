package fr.spacefox.perftests.quarkus.rest.endpoint773;

import fr.spacefox.perftests.quarkus.core.service773.model.Model773;
import fr.spacefox.perftests.quarkus.rest.endpoint773.schema.Schema773;

final class Mapper {
    private Mapper() {}

    public static Schema773 of(Model773 model) {
        return new Schema773(model.id(), model.value());
    }
}
