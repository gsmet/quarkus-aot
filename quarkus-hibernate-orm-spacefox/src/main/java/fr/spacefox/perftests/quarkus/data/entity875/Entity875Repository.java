package fr.spacefox.perftests.quarkus.data.entity875;

import fr.spacefox.perftests.quarkus.core.port.data.Entity875DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service875.model.Model875;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity875Repository implements Entity875DatasourcePort, PanacheRepository<Entity875> {
    @Override
    public Optional<Model875> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
