package fr.spacefox.perftests.quarkus.data.entity161;

import fr.spacefox.perftests.quarkus.core.port.data.Entity161DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service161.model.Model161;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity161Repository implements Entity161DatasourcePort, PanacheRepository<Entity161> {
    @Override
    public Optional<Model161> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
