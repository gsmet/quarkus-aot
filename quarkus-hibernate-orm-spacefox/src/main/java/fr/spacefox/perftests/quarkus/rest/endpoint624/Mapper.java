package fr.spacefox.perftests.quarkus.rest.endpoint624;

import fr.spacefox.perftests.quarkus.core.service624.model.Model624;
import fr.spacefox.perftests.quarkus.rest.endpoint624.schema.Schema624;

final class Mapper {
    private Mapper() {}

    public static Schema624 of(Model624 model) {
        return new Schema624(model.id(), model.value());
    }
}
