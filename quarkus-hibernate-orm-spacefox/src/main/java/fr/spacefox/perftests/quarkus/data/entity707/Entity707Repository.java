package fr.spacefox.perftests.quarkus.data.entity707;

import fr.spacefox.perftests.quarkus.core.port.data.Entity707DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service707.model.Model707;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity707Repository implements Entity707DatasourcePort, PanacheRepository<Entity707> {
    @Override
    public Optional<Model707> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
