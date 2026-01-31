package fr.spacefox.perftests.quarkus.rest.endpoint110;

import fr.spacefox.perftests.quarkus.core.service110.model.Model110;
import fr.spacefox.perftests.quarkus.rest.endpoint110.schema.Schema110;

final class Mapper {
    private Mapper() {}

    public static Schema110 of(Model110 model) {
        return new Schema110(model.id(), model.value());
    }
}
