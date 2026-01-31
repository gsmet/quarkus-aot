package fr.spacefox.perftests.quarkus.data.entity977;

import fr.spacefox.perftests.quarkus.core.port.data.Entity977DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service977.model.Model977;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity977Repository implements Entity977DatasourcePort, PanacheRepository<Entity977> {
    @Override
    public Optional<Model977> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
