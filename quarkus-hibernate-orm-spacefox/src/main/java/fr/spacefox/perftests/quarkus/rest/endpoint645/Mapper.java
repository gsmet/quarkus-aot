package fr.spacefox.perftests.quarkus.rest.endpoint645;

import fr.spacefox.perftests.quarkus.core.service645.model.Model645;
import fr.spacefox.perftests.quarkus.rest.endpoint645.schema.Schema645;

final class Mapper {
    private Mapper() {}

    public static Schema645 of(Model645 model) {
        return new Schema645(model.id(), model.value());
    }
}
