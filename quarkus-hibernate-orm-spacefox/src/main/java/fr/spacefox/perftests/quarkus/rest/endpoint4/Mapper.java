package fr.spacefox.perftests.quarkus.rest.endpoint4;

import fr.spacefox.perftests.quarkus.core.service4.model.Model4;
import fr.spacefox.perftests.quarkus.rest.endpoint4.schema.Schema4;

final class Mapper {
    private Mapper() {}

    public static Schema4 of(Model4 model) {
        return new Schema4(model.id(), model.value());
    }
}
