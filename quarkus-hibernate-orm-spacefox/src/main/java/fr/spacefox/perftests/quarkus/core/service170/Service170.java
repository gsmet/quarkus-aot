package fr.spacefox.perftests.quarkus.core.service170;

import fr.spacefox.perftests.quarkus.core.port.data.Entity170DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service170.model.Model170;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service170 {

    private final Entity170DatasourcePort datasource;

    public Service170(Entity170DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model170 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
