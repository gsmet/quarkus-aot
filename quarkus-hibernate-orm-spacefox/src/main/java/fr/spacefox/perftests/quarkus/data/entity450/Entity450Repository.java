package fr.spacefox.perftests.quarkus.data.entity450;

import fr.spacefox.perftests.quarkus.core.port.data.Entity450DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service450.model.Model450;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity450Repository implements Entity450DatasourcePort, PanacheRepository<Entity450> {
    @Override
    public Optional<Model450> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
