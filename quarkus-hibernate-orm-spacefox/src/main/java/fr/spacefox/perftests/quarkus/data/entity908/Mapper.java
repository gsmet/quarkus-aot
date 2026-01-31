package fr.spacefox.perftests.quarkus.data.entity908;

import fr.spacefox.perftests.quarkus.core.service908.model.Model908;

final class Mapper {
    private Mapper() {}

    public static Model908 of(Entity908 entity) {
        return new Model908(entity.getId(), entity.getField());
    }
}
