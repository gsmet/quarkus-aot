package fr.spacefox.perftests.quarkus.data.entity785;

import fr.spacefox.perftests.quarkus.core.port.data.Entity785DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service785.model.Model785;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity785Repository implements Entity785DatasourcePort, PanacheRepository<Entity785> {
    @Override
    public Optional<Model785> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
