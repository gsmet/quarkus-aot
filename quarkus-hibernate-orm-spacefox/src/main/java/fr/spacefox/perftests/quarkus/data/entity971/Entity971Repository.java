package fr.spacefox.perftests.quarkus.data.entity971;

import fr.spacefox.perftests.quarkus.core.port.data.Entity971DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service971.model.Model971;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity971Repository implements Entity971DatasourcePort, PanacheRepository<Entity971> {
    @Override
    public Optional<Model971> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
