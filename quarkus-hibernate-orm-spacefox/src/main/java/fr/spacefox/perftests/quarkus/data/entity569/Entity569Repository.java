package fr.spacefox.perftests.quarkus.data.entity569;

import fr.spacefox.perftests.quarkus.core.port.data.Entity569DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service569.model.Model569;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity569Repository implements Entity569DatasourcePort, PanacheRepository<Entity569> {
    @Override
    public Optional<Model569> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
