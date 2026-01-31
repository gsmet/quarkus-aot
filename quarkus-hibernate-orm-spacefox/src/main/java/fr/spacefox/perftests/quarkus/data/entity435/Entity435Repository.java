package fr.spacefox.perftests.quarkus.data.entity435;

import fr.spacefox.perftests.quarkus.core.port.data.Entity435DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service435.model.Model435;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity435Repository implements Entity435DatasourcePort, PanacheRepository<Entity435> {
    @Override
    public Optional<Model435> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
