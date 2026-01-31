package fr.spacefox.perftests.quarkus.data.entity967;

import fr.spacefox.perftests.quarkus.core.port.data.Entity967DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service967.model.Model967;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity967Repository implements Entity967DatasourcePort, PanacheRepository<Entity967> {
    @Override
    public Optional<Model967> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
