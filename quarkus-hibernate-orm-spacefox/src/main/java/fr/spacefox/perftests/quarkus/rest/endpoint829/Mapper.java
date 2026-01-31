package fr.spacefox.perftests.quarkus.rest.endpoint829;

import fr.spacefox.perftests.quarkus.core.service829.model.Model829;
import fr.spacefox.perftests.quarkus.rest.endpoint829.schema.Schema829;

final class Mapper {
    private Mapper() {}

    public static Schema829 of(Model829 model) {
        return new Schema829(model.id(), model.value());
    }
}
