package fr.spacefox.perftests.quarkus.data.entity644;

import fr.spacefox.perftests.quarkus.core.port.data.Entity644DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service644.model.Model644;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity644Repository implements Entity644DatasourcePort, PanacheRepository<Entity644> {
    @Override
    public Optional<Model644> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
