package fr.spacefox.perftests.quarkus.rest.endpoint169;

import fr.spacefox.perftests.quarkus.core.service169.model.Model169;
import fr.spacefox.perftests.quarkus.rest.endpoint169.schema.Schema169;

final class Mapper {
    private Mapper() {}

    public static Schema169 of(Model169 model) {
        return new Schema169(model.id(), model.value());
    }
}
