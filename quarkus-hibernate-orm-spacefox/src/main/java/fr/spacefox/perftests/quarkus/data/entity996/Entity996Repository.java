package fr.spacefox.perftests.quarkus.data.entity996;

import fr.spacefox.perftests.quarkus.core.port.data.Entity996DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service996.model.Model996;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity996Repository implements Entity996DatasourcePort, PanacheRepository<Entity996> {
    @Override
    public Optional<Model996> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
