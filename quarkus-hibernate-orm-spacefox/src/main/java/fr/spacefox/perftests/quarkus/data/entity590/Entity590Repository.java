package fr.spacefox.perftests.quarkus.data.entity590;

import fr.spacefox.perftests.quarkus.core.port.data.Entity590DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service590.model.Model590;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity590Repository implements Entity590DatasourcePort, PanacheRepository<Entity590> {
    @Override
    public Optional<Model590> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
