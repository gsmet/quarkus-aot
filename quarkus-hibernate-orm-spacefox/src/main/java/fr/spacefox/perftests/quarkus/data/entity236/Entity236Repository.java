package fr.spacefox.perftests.quarkus.data.entity236;

import fr.spacefox.perftests.quarkus.core.port.data.Entity236DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service236.model.Model236;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity236Repository implements Entity236DatasourcePort, PanacheRepository<Entity236> {
    @Override
    public Optional<Model236> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
