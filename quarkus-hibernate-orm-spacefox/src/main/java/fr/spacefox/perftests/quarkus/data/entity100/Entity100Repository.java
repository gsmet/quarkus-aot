package fr.spacefox.perftests.quarkus.data.entity100;

import fr.spacefox.perftests.quarkus.core.port.data.Entity100DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service100.model.Model100;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity100Repository implements Entity100DatasourcePort, PanacheRepository<Entity100> {
    @Override
    public Optional<Model100> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
