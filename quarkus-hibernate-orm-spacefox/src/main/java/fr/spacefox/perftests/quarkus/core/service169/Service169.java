package fr.spacefox.perftests.quarkus.core.service169;

import fr.spacefox.perftests.quarkus.core.port.data.Entity169DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service169.model.Model169;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service169 {

    private final Entity169DatasourcePort datasource;

    public Service169(Entity169DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model169 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
