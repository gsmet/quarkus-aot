package fr.spacefox.perftests.quarkus.data.entity839;

import fr.spacefox.perftests.quarkus.core.port.data.Entity839DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service839.model.Model839;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity839Repository implements Entity839DatasourcePort, PanacheRepository<Entity839> {
    @Override
    public Optional<Model839> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
