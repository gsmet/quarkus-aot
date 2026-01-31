package fr.spacefox.perftests.quarkus.data.entity638;

import fr.spacefox.perftests.quarkus.core.service638.model.Model638;

final class Mapper {
    private Mapper() {}

    public static Model638 of(Entity638 entity) {
        return new Model638(entity.getId(), entity.getField());
    }
}
