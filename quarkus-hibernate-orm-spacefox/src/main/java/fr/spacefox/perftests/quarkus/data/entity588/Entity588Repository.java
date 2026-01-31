package fr.spacefox.perftests.quarkus.data.entity588;

import fr.spacefox.perftests.quarkus.core.port.data.Entity588DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service588.model.Model588;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity588Repository implements Entity588DatasourcePort, PanacheRepository<Entity588> {
    @Override
    public Optional<Model588> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
