package fr.spacefox.perftests.quarkus.data.entity520;

import fr.spacefox.perftests.quarkus.core.service520.model.Model520;

final class Mapper {
    private Mapper() {}

    public static Model520 of(Entity520 entity) {
        return new Model520(entity.getId(), entity.getField());
    }
}
