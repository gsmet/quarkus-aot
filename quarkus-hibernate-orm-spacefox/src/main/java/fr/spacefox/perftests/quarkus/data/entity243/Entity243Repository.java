package fr.spacefox.perftests.quarkus.data.entity243;

import fr.spacefox.perftests.quarkus.core.port.data.Entity243DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service243.model.Model243;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity243Repository implements Entity243DatasourcePort, PanacheRepository<Entity243> {
    @Override
    public Optional<Model243> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
