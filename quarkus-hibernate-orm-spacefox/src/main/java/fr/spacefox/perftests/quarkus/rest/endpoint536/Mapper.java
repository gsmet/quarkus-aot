package fr.spacefox.perftests.quarkus.rest.endpoint536;

import fr.spacefox.perftests.quarkus.core.service536.model.Model536;
import fr.spacefox.perftests.quarkus.rest.endpoint536.schema.Schema536;

final class Mapper {
    private Mapper() {}

    public static Schema536 of(Model536 model) {
        return new Schema536(model.id(), model.value());
    }
}
