package fr.spacefox.perftests.quarkus.data.entity763;

import fr.spacefox.perftests.quarkus.core.service763.model.Model763;

final class Mapper {
    private Mapper() {}

    public static Model763 of(Entity763 entity) {
        return new Model763(entity.getId(), entity.getField());
    }
}
