package fr.spacefox.perftests.quarkus.core.service617;

import fr.spacefox.perftests.quarkus.core.port.data.Entity617DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service617.model.Model617;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service617 {

    private final Entity617DatasourcePort datasource;

    public Service617(Entity617DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model617 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
