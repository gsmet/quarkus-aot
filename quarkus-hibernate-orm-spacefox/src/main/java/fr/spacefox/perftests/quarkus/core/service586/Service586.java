package fr.spacefox.perftests.quarkus.core.service586;

import fr.spacefox.perftests.quarkus.core.port.data.Entity586DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service586.model.Model586;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service586 {

    private final Entity586DatasourcePort datasource;

    public Service586(Entity586DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model586 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
