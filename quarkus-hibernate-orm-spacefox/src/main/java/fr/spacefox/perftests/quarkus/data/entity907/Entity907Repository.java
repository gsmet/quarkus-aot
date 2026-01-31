package fr.spacefox.perftests.quarkus.data.entity907;

import fr.spacefox.perftests.quarkus.core.port.data.Entity907DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service907.model.Model907;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity907Repository implements Entity907DatasourcePort, PanacheRepository<Entity907> {
    @Override
    public Optional<Model907> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
