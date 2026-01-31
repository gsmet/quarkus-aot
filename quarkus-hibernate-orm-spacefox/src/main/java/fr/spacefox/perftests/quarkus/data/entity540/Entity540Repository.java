package fr.spacefox.perftests.quarkus.data.entity540;

import fr.spacefox.perftests.quarkus.core.port.data.Entity540DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service540.model.Model540;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity540Repository implements Entity540DatasourcePort, PanacheRepository<Entity540> {
    @Override
    public Optional<Model540> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
