package fr.spacefox.perftests.quarkus.data.entity98;

import fr.spacefox.perftests.quarkus.core.port.data.Entity98DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service98.model.Model98;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity98Repository implements Entity98DatasourcePort, PanacheRepository<Entity98> {
    @Override
    public Optional<Model98> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
