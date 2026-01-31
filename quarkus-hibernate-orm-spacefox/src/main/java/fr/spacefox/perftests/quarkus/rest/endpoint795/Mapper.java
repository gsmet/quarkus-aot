package fr.spacefox.perftests.quarkus.rest.endpoint795;

import fr.spacefox.perftests.quarkus.core.service795.model.Model795;
import fr.spacefox.perftests.quarkus.rest.endpoint795.schema.Schema795;

final class Mapper {
    private Mapper() {}

    public static Schema795 of(Model795 model) {
        return new Schema795(model.id(), model.value());
    }
}
