package fr.spacefox.perftests.quarkus.data.entity997;

import fr.spacefox.perftests.quarkus.core.port.data.Entity997DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service997.model.Model997;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity997Repository implements Entity997DatasourcePort, PanacheRepository<Entity997> {
    @Override
    public Optional<Model997> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
