package fr.spacefox.perftests.quarkus.data.entity288;

import fr.spacefox.perftests.quarkus.core.port.data.Entity288DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service288.model.Model288;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity288Repository implements Entity288DatasourcePort, PanacheRepository<Entity288> {
    @Override
    public Optional<Model288> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
