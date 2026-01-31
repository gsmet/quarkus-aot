package fr.spacefox.perftests.quarkus.rest.endpoint170;

import fr.spacefox.perftests.quarkus.core.service170.model.Model170;
import fr.spacefox.perftests.quarkus.rest.endpoint170.schema.Schema170;

final class Mapper {
    private Mapper() {}

    public static Schema170 of(Model170 model) {
        return new Schema170(model.id(), model.value());
    }
}
