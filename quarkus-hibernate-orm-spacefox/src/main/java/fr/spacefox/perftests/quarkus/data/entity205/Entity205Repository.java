package fr.spacefox.perftests.quarkus.data.entity205;

import fr.spacefox.perftests.quarkus.core.port.data.Entity205DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service205.model.Model205;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity205Repository implements Entity205DatasourcePort, PanacheRepository<Entity205> {
    @Override
    public Optional<Model205> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
